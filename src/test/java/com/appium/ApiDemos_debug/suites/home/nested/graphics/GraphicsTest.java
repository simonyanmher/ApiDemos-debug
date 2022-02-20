package com.appium.ApiDemos_debug.suites.home.nested.graphics;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.graphics.Graphics;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.graphics.strings.GraphicsStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GraphicsTest extends BaseTest {
    private Graphics graphics;
    private final String name = Graphics.class.getSimpleName();

    @BeforeClass
    public void initializeGraphics() {
        initializingLog(name);
        Home home = new Home(driver);
        graphics = new Graphics(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getGraphicsTest() {
        assertEquals(graphics.getAlphaBitmap().getText(), GraphicsStrings.ALPHA_BITMAP);
        assertEquals(graphics.getAnimateDrawables().getText(), GraphicsStrings.ANIMATE_DRAWABLES);
        assertEquals(graphics.getArcs().getText(), GraphicsStrings.ARCS);
        assertEquals(graphics.getBitmapDecode().getText(), GraphicsStrings.BITMAP_DECODE);
        assertEquals(graphics.getBitmapMesh().getText(), GraphicsStrings.BITMAP_MESH);
        assertEquals(graphics.getBitmapPixels().getText(), GraphicsStrings.BITMAP_PIXELS);
        assertEquals(graphics.getCameraPreview().getText(), GraphicsStrings.CAMERA_PREVIEW);
        assertEquals(graphics.getClipping().getText(), GraphicsStrings.CLIPPING);
        assertEquals(graphics.getColorFilters().getText(), GraphicsStrings.COLOR_FILTERS);
        assertEquals(graphics.getColorMatrix().getText(), GraphicsStrings.COLOR_MATRIX);
        assertEquals(graphics.getCompass().getText(), GraphicsStrings.COMPASS);
        assertEquals(graphics.getCreateBitmap().getText(), GraphicsStrings.CREATE_BITMAP);

        scrollDown(GraphicsStrings.PURGEABLE_BITMAP);

        assertEquals(graphics.getDensity().getText(), GraphicsStrings.DENSITY);
        assertEquals(graphics.getDrawable().getText(), GraphicsStrings.DRAWABLE);
        assertEquals(graphics.getFingerPaint().getText(), GraphicsStrings.FINGER_PAINT);
        assertEquals(graphics.getLayers().getText(), GraphicsStrings.LAYERS);
        assertEquals(graphics.getMeasureText().getText(), GraphicsStrings.MEASURE_TEXT);
        assertEquals(graphics.getOpenGlEs().getText(), GraphicsStrings.OPEN_GL_ES);
        assertEquals(graphics.getPathEffects().getText(), GraphicsStrings.PATH_EFFECTS);
        assertEquals(graphics.getPathFillTypes().getText(), GraphicsStrings.PATH_FILL_TYPES);
        assertEquals(graphics.getPatterns().getText(), GraphicsStrings.PATTERNS);
        assertEquals(graphics.getPoints().getText(), GraphicsStrings.POINTS);
        assertEquals(graphics.getPolyToPoly().getText(), GraphicsStrings.POLY_TO_POLY);
        assertEquals(graphics.getPurgeableBitmap().getText(), GraphicsStrings.PURGEABLE_BITMAP);

        scrollDown(GraphicsStrings.VERTICES);

        assertEquals(graphics.getRegions().getText(), GraphicsStrings.REGIONS);
        assertEquals(graphics.getRoundRects().getText(), GraphicsStrings.ROUND_RECTS);
        assertEquals(graphics.getScaleToFit().getText(), GraphicsStrings.SCALE_TO_FIT);
        assertEquals(graphics.getSensorTest().getText(), GraphicsStrings.SENSOR_TEST);
        assertEquals(graphics.getSurfaceWindow().getText(), GraphicsStrings.SURFACE_WINDOW);
        assertEquals(graphics.getSurfaceViewOverlay().getText(), GraphicsStrings.SURFACE_VIEW_OVERLAY);
        assertEquals(graphics.getSweep().getText(), GraphicsStrings.SWEEP);
        assertEquals(graphics.getTextAlign().getText(), GraphicsStrings.TEXT_ALIGN);
        assertEquals(graphics.getTouchPaint().getText(), GraphicsStrings.TOUCH_PAINT);
        assertEquals(graphics.getTypefaces().getText(), GraphicsStrings.TYPEFACES);
        assertEquals(graphics.getUnicodeChart().getText(), GraphicsStrings.UNICODE_CHART);
        assertEquals(graphics.getVertices().getText(), GraphicsStrings.VERTICES);

        scrollDown(GraphicsStrings.XFERMODES);

        assertEquals(graphics.getXfermodes().getText(), GraphicsStrings.XFERMODES);
    }
}
