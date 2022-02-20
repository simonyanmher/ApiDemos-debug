package com.appium.ApiDemos_debug.pages.home.nested.graphics;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.graphics.strings.GraphicsStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Graphics extends Base<Graphics> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = GraphicsStrings.ALPHA_BITMAP)
    private AndroidElement alphaBitmap;

    @AndroidFindBy(accessibility = GraphicsStrings.ANIMATE_DRAWABLES)
    private AndroidElement animateDrawables;

    @AndroidFindBy(accessibility = GraphicsStrings.ARCS)
    private AndroidElement arcs;

    @AndroidFindBy(accessibility = GraphicsStrings.BITMAP_DECODE)
    private AndroidElement bitmapDecode;

    @AndroidFindBy(accessibility = GraphicsStrings.BITMAP_MESH)
    private AndroidElement bitmapMesh;

    @AndroidFindBy(accessibility = GraphicsStrings.BITMAP_PIXELS)
    private AndroidElement bitmapPixels;

    @AndroidFindBy(accessibility = GraphicsStrings.CAMERA_PREVIEW)
    private AndroidElement cameraPreview;

    @AndroidFindBy(accessibility = GraphicsStrings.CLIPPING)
    private AndroidElement clipping;

    @AndroidFindBy(accessibility = GraphicsStrings.COLOR_FILTERS)
    private AndroidElement colorFilters;

    @AndroidFindBy(accessibility = GraphicsStrings.COLOR_MATRIX)
    private AndroidElement colorMatrix;

    @AndroidFindBy(accessibility = GraphicsStrings.COMPASS)
    private AndroidElement compass;

    @AndroidFindBy(accessibility = GraphicsStrings.CREATE_BITMAP)
    private AndroidElement createBitmap;

    @AndroidFindBy(accessibility = GraphicsStrings.DENSITY)
    private AndroidElement density;

    @AndroidFindBy(accessibility = GraphicsStrings.DRAWABLE)
    private AndroidElement drawable;

    @AndroidFindBy(accessibility = GraphicsStrings.FINGER_PAINT)
    private AndroidElement fingerPaint;

    @AndroidFindBy(accessibility = GraphicsStrings.LAYERS)
    private AndroidElement layers;

    @AndroidFindBy(accessibility = GraphicsStrings.MEASURE_TEXT)
    private AndroidElement measureText;

    @AndroidFindBy(accessibility = GraphicsStrings.OPEN_GL_ES)
    private AndroidElement openGlEs;

    @AndroidFindBy(accessibility = GraphicsStrings.PATH_EFFECTS)
    private AndroidElement pathEffects;

    @AndroidFindBy(accessibility = GraphicsStrings.PATH_FILL_TYPES)
    private AndroidElement pathFillTypes;

    @AndroidFindBy(accessibility = GraphicsStrings.PATTERNS)
    private AndroidElement patterns;

    @AndroidFindBy(accessibility = GraphicsStrings.POINTS)
    private AndroidElement points;

    @AndroidFindBy(accessibility = GraphicsStrings.POLY_TO_POLY)
    private AndroidElement polyToPoly;

    @AndroidFindBy(accessibility = GraphicsStrings.PURGEABLE_BITMAP)
    private AndroidElement purgeableBitmap;

    @AndroidFindBy(accessibility = GraphicsStrings.REGIONS)
    private AndroidElement regions;

    @AndroidFindBy(accessibility = GraphicsStrings.ROUND_RECTS)
    private AndroidElement roundRects;

    @AndroidFindBy(accessibility = GraphicsStrings.SCALE_TO_FIT)
    private AndroidElement scaleToFit;

    @AndroidFindBy(accessibility = GraphicsStrings.SENSOR_TEST)
    private AndroidElement sensorTest;

    @AndroidFindBy(accessibility = GraphicsStrings.SURFACE_WINDOW)
    private AndroidElement surfaceWindow;

    @AndroidFindBy(accessibility = GraphicsStrings.SURFACE_VIEW_OVERLAY)
    private AndroidElement surfaceViewOverlay;

    @AndroidFindBy(accessibility = GraphicsStrings.SWEEP)
    private AndroidElement sweep;

    @AndroidFindBy(accessibility = GraphicsStrings.TEXT_ALIGN)
    private AndroidElement textAlign;

    @AndroidFindBy(accessibility = GraphicsStrings.TOUCH_PAINT)
    private AndroidElement touchPaint;

    @AndroidFindBy(accessibility = GraphicsStrings.TYPEFACES)
    private AndroidElement typefaces;

    @AndroidFindBy(accessibility = GraphicsStrings.UNICODE_CHART)
    private AndroidElement unicodeChart;

    @AndroidFindBy(accessibility = GraphicsStrings.VERTICES)
    private AndroidElement vertices;

    @AndroidFindBy(accessibility = GraphicsStrings.XFERMODES)
    private AndroidElement xfermodes;

    public Graphics(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getGraphics());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert alphaBitmap.getText().equals(GraphicsStrings.ALPHA_BITMAP);
            assert animateDrawables.getText().equals(GraphicsStrings.ANIMATE_DRAWABLES);
            assert arcs.getText().equals(GraphicsStrings.ARCS);
            assert bitmapDecode.getText().equals(GraphicsStrings.BITMAP_DECODE);
            assert bitmapMesh.getText().equals(GraphicsStrings.BITMAP_MESH);
            assert bitmapPixels.getText().equals(GraphicsStrings.BITMAP_PIXELS);
            assert cameraPreview.getText().equals(GraphicsStrings.CAMERA_PREVIEW);
            assert clipping.getText().equals(GraphicsStrings.CLIPPING);
            assert colorFilters.getText().equals(GraphicsStrings.COLOR_FILTERS);
            assert colorMatrix.getText().equals(GraphicsStrings.COLOR_MATRIX);
            assert compass.getText().equals(GraphicsStrings.COMPASS);
            assert createBitmap.getText().equals(GraphicsStrings.CREATE_BITMAP);
            assert density.getText().equals(GraphicsStrings.DENSITY);
            assert drawable.getText().equals(GraphicsStrings.DRAWABLE);
            assert fingerPaint.getText().equals(GraphicsStrings.FINGER_PAINT);
            assert layers.getText().equals(GraphicsStrings.LAYERS);
            assert measureText.getText().equals(GraphicsStrings.MEASURE_TEXT);
            assert openGlEs.getText().equals(GraphicsStrings.OPEN_GL_ES);
            assert pathEffects.getText().equals(GraphicsStrings.PATH_EFFECTS);
            assert pathFillTypes.getText().equals(GraphicsStrings.PATH_FILL_TYPES);
            assert patterns.getText().equals(GraphicsStrings.PATTERNS);
            assert points.getText().equals(GraphicsStrings.POINTS);
            assert polyToPoly.getText().equals(GraphicsStrings.POLY_TO_POLY);
            assert purgeableBitmap.getText().equals(GraphicsStrings.PURGEABLE_BITMAP);
            assert regions.getText().equals(GraphicsStrings.REGIONS);
            assert roundRects.getText().equals(GraphicsStrings.ROUND_RECTS);
            assert scaleToFit.getText().equals(GraphicsStrings.SCALE_TO_FIT);
            assert sensorTest.getText().equals(GraphicsStrings.SENSOR_TEST);
            assert surfaceWindow.getText().equals(GraphicsStrings.SURFACE_WINDOW);
            assert surfaceViewOverlay.getText().equals(GraphicsStrings.SURFACE_VIEW_OVERLAY);
            assert sweep.getText().equals(GraphicsStrings.SWEEP);
            assert textAlign.getText().equals(GraphicsStrings.TEXT_ALIGN);
            assert touchPaint.getText().equals(GraphicsStrings.TOUCH_PAINT);
            assert typefaces.getText().equals(GraphicsStrings.TYPEFACES);
            assert unicodeChart.getText().equals(GraphicsStrings.UNICODE_CHART);
            assert vertices.getText().equals(GraphicsStrings.VERTICES);
            assert xfermodes.getText().equals(GraphicsStrings.XFERMODES);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getAlphaBitmap() {
        return alphaBitmap;
    }

    public AndroidElement getAnimateDrawables() {
        return animateDrawables;
    }

    public AndroidElement getArcs() {
        return arcs;
    }

    public AndroidElement getBitmapDecode() {
        return bitmapDecode;
    }

    public AndroidElement getBitmapMesh() {
        return bitmapMesh;
    }

    public AndroidElement getBitmapPixels() {
        return bitmapPixels;
    }

    public AndroidElement getCameraPreview() {
        return cameraPreview;
    }

    public AndroidElement getClipping() {
        return clipping;
    }

    public AndroidElement getColorFilters() {
        return colorFilters;
    }

    public AndroidElement getColorMatrix() {
        return colorMatrix;
    }

    public AndroidElement getCompass() {
        return compass;
    }

    public AndroidElement getCreateBitmap() {
        return createBitmap;
    }

    public AndroidElement getDensity() {
        return density;
    }

    public AndroidElement getDrawable() {
        return drawable;
    }

    public AndroidElement getFingerPaint() {
        return fingerPaint;
    }

    public AndroidElement getLayers() {
        return layers;
    }

    public AndroidElement getMeasureText() {
        return measureText;
    }

    public AndroidElement getOpenGlEs() {
        return openGlEs;
    }

    public AndroidElement getPathEffects() {
        return pathEffects;
    }

    public AndroidElement getPathFillTypes() {
        return pathFillTypes;
    }

    public AndroidElement getPatterns() {
        return patterns;
    }

    public AndroidElement getPoints() {
        return points;
    }

    public AndroidElement getPolyToPoly() {
        return polyToPoly;
    }

    public AndroidElement getPurgeableBitmap() {
        return purgeableBitmap;
    }

    public AndroidElement getRegions() {
        return regions;
    }

    public AndroidElement getRoundRects() {
        return roundRects;
    }

    public AndroidElement getScaleToFit() {
        return scaleToFit;
    }

    public AndroidElement getSensorTest() {
        return sensorTest;
    }

    public AndroidElement getSurfaceWindow() {
        return surfaceWindow;
    }

    public AndroidElement getSurfaceViewOverlay() {
        return surfaceViewOverlay;
    }

    public AndroidElement getSweep() {
        return sweep;
    }

    public AndroidElement getTextAlign() {
        return textAlign;
    }

    public AndroidElement getTouchPaint() {
        return touchPaint;
    }

    public AndroidElement getTypefaces() {
        return typefaces;
    }

    public AndroidElement getUnicodeChart() {
        return unicodeChart;
    }

    public AndroidElement getVertices() {
        return vertices;
    }

    public AndroidElement getXfermodes() {
        return xfermodes;
    }
}
